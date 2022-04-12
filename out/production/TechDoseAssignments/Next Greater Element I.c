struct stack{
    struct stack *next;
    int data;
};
void push(int data,struct stack **head){
    struct stack *NewNode=malloc(sizeof(struct stack));
    NewNode->data=data;
    NewNode->next=NULL;
    if((*head)!=NULL){
        NewNode->next=(*head);
        (*head)=NewNode;
    }
    else (*head)=NewNode;
}
void pop(struct stack **head){
    struct stack *Top=(*head);
    (*head)=(*head)->next;
    free(Top);
}
int* nextGreaterElement(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize){
    int *toReturn=(int*)malloc(sizeof(int)*nums2Size);
    struct stack *head=NULL;
    for(int i=0;i<nums2Size;i++) toReturn[i]=-1;
    for(int i=0;i<nums2Size;i++){
        if(head==NULL || nums2[head->data]>=nums2[i]) push(i,&head);
        else{
            while(head!=NULL && nums2[head->data]<nums2[i]){
                toReturn[head->data]=nums2[i];
                pop(&head);
            }
            push(i,&head);
        }
    }
    int *NextGreater=(int*)malloc(sizeof(int)*nums1Size);
    for(int i=0;i<nums1Size;i++){
        for(int j=0;j<nums2Size;j++){
            if(nums1[i]==nums2[j]){
                NextGreater[i]=toReturn[j];
                break;
            }
        }
    }
    *returnSize=nums1Size;
    return NextGreater;
}
