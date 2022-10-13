public class MergeSort {
    /*
    void merge(int tab[],int start, int stop)
    {
        int[] temp = new int[tab.length];
        int i=start, mid=(start+stop)/2, j=mid+1;
        for (int k=start; k<=stop; k++)
        {
            if (i==mid+1)
            {
                temp[k]=tab[j++];
                continue;
            }
            if (j==stop+1)
            {
                temp[k]=tab[i++];
                continue;
            }
            if (tab[i]<=tab[j])
                temp[k]=tab[i++];
            else
                temp[k]=tab[j++];
        }
        for (int k=start; k<=stop; k++)
            tab[k]=temp[k];
    }*/

    void merge(int tab[],int start, int stop)
    {
        int[] temp = new int[tab.length];
        int i=start, mid=(start+stop)/2, j=mid+1;
        for (int k=start; k<=stop; k++)
        {
            if (i==mid+1)
            {
                temp[k]=tab[j++];
                continue;
            }
            if (j==stop+1)
            {
                temp[k]=tab[i++];
                continue;
            }
            if (tab[i]>tab[j])
                temp[k]=tab[i++];
            else
                temp[k]=tab[j++];
        }
        for (int k=start; k<=stop; k++)
            tab[k]=temp[k];
    }
    void sort(int tab[], int start, int stop)
    {
        if (start >= stop)
            return;
            sort(tab, start, (start+stop)/2);
            sort(tab, (start+stop)/2 + 1, stop);
            merge(tab, start, stop);
    }
}
