public class Printer {

    private int paper;

    public Printer(int paper) {
        this.paper = paper;
    }
    public int getPaper() {
         return paper;
        }
    public void print(int copies, int pages){
        int totalPages = copies * pages;
        if(paper >= totalPages ){
            this.paper -= totalPages; // this.paper = this.paper - totalPages
        }

    }

    }

//







