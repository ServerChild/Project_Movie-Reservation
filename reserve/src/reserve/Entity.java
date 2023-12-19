package reserve;

public class Entity {
	
	//영화 관련
	private String mTitle; //영화이름
	private String mDate; //영화날짜
	private String mLocal; //영화관지역
	private String mTheater; //영화관
	private String mTime; //영화시간
	private String mSeat; //영화좌석
	
	
	//회원 관련
	private String id; //아이디
	private String pwd; //비밀번호
	private String name; //회원이름
	private String gender; //회원성별
	
	public Entity() {}
	
	//영화관련생성자
	public Entity(String mTitle, String mDate, String mLocal, String mTheater, String mTime, String mSeat) {
		this.mTitle = mTitle;
		this.mDate = mDate;
		this.mLocal = mLocal;
		this.mTheater = mTheater;
		this.mTime = mTime;
		this.mSeat = mSeat;
	}
	
	//회원관련생성자
	public Entity(String id, String pwd, String name, String gender) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.gender = gender;
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public String getmDate() {
		return mDate;
	}

	public void setmDate(String mDate) {
		this.mDate = mDate;
	}

	public String getmLocal() {
		return mLocal;
	}

	public void setmLocal(String mLocal) {
		this.mLocal = mLocal;
	}

	public String getmTheater() {
		return mTheater;
	}

	public void setmTheater(String mTheater) {
		this.mTheater = mTheater;
	}

	public String getmTime() {
		return mTime;
	}

	public void setmTime(String mTime) {
		this.mTime = mTime;
	}

	public String getmSeat() {
		return mSeat;
	}

	public void setmSeat(String mSeat) {
		this.mSeat = mSeat;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}

