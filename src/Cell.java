//ϸ���࣬��ź�ϸ���йص����ݺͷ���
public class Cell {
	private int Status;   //0-���� 1-���
	private int Living;   //��Χ��ϸ����Ŀ
//	private int X;
//	private int Y;
	Cell(){
		Status=0;
		Living=0;
	}
	Cell(int m_Status,int m_Living){
		Status=m_Status;
		Living=m_Living;
	}
	public int getStatus() {
		return Status;//��ȡ״̬
	}
	public void setStatus(int m_Status) {
		Status=m_Status;//����״̬
	}
	public int getLiving() {
		return Living;//��ȡ��ǰ��Χ��ϸ����Ŀ
	}
	public void setLiving(int m_Living) {
		Living=m_Living;//���õ�ǰ��Χ��ϸ����Ŀ
	}
	public void UpdateStatus() {
		if(this.getLiving()>3||this.getLiving()<2) this.setStatus(0);
		else if(this.getLiving()==3) this.setStatus(1);
		else this.setStatus(this.Status);
	}
//    public int getX() {
//    	//��ȡx����
//    }
//    public void setX(int m_X) {
//    	//����x����
//    }
//    public int getY() {
//    	//��ȡy����
//    }
//    public void setY(int m_Y) {
//    	//����y����
//    }
}
