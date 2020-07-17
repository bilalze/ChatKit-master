package com.stfalcon.chatkit.sample.features.demo.custom.media.holders;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.stfalcon.chatkit.messages.MessageHolders;
import com.stfalcon.chatkit.sample.R;
import com.stfalcon.chatkit.sample.common.data.model.Message;
import com.stfalcon.chatkit.sample.utils.FormatUtils;
import com.stfalcon.chatkit.utils.DateFormatter;

/*
 * Created by troy379 on 05.04.17.
 */
public class IncomingButtonMessageViewHolder
        extends MessageHolders.IncomingTextMessageViewHolder<Message> {

    private TextView Text1;
    private ImageView Image1;
    private TextView tvTime;
    public Button button1;

    public IncomingButtonMessageViewHolder(View itemView, Object payload) {
        super(itemView, payload);
        Text1 = (TextView) itemView.findViewById(R.id.messageText);
        Image1 = (ImageView) itemView.findViewById(R.id.image);
        tvTime = (TextView) itemView.findViewById(R.id.messageTime);
        button1=(Button) itemView.findViewById(R.id.button1);
    }

    @Override
    public void onBind(Message message) {
        super.onBind(message);
        Text1.setText("How you doin?");

        tvTime.setText(DateFormatter.format(message.getCreatedAt(), DateFormatter.Template.TIME));
    }

}
