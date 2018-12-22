package kr.tjeit.listview_20181222_02.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import kr.tjeit.listview_20181222_02.R;
import kr.tjeit.listview_20181222_02.datas.Member;

public class MemberAdapter extends ArrayAdapter<Member> {

    Context mContext = null;
    List<Member> mlist = null;
    LayoutInflater inf = null;

    public MemberAdapter(Context context, List<Member> list) {

        super(context, R.layout.member_list_item, list);

        this.mContext = context;
        this.mlist = list;
        this.inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {


        View row = convertView;
        if( row == null){
            row = inf.inflate(R.layout.member_list_item,null);
        }


        return  row;

    }
}