package common.email;

import org.json.simple.JSONObject;

public class EmailHost {

	/**新增emial服务器
	 * @param ownid
	 * @param userid
	 * @param password
	 * @param smtp
	 * @param pop3
	 * @return
	 */
	/*
	public final static String addHost(String ownid,String userid,String password,String smtp,String pop3){
		Object ro = null;
        DbLayerHelper _db = getEmailDB();
		JSONObject data;
		JSONObject rs = _db.eq("ownid", ownid).eq("userid", userid).eq("smtp", smtp).find();
		if( rs == null){
			data = new JSONObject();
			data.put("id", null);
			data.put("ownid", ownid);
			data.put("smtp", smtp);
			data.put("pop3", pop3);
			data.put("userid", userid);
			data.put("password", password );
			data.put("state", 0);
			data.put("time", null);
			ro = _db.data(data).insertOnce();
		}
		return ro == null ? "" : ro.toString();
	}
	*/
	/**更新email服务器信息
	 * @param hostid
	 * @param newobj
	 * @return
	 */
	/*
	public final static boolean editHost(int hostid,JSONObject newobj){
		if( newobj.containsKey("password") ){
			newobj.put("password", newobj.get("password").toString() );
		}
		return getEmailDB().update(hostid, newobj);
	}
	*/
	/**删除email服务器信息
	 * @param hostid
	 * @return
	 */
	/*
	public final static boolean removeHost(String hostid){
		return getEmailDB().delete(Integer.parseInt(hostid));
	}
	*/
}
