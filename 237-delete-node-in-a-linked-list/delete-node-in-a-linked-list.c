/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* ptr)
{
    struct ListNode *temp=NULL;
    while(ptr->next!=NULL)
    {
        ptr->val=ptr->next->val;
        temp=ptr;
        ptr=ptr->next;
    }
    temp->next=NULL;
    free(ptr);
}