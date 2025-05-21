package com.google.android.gms.smartdevice.d2d.ui.accountpicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.owners.ParcelableDeviceOwner;
import com.google.android.gms.smartdevice.setup.ui.views.CircularImageView;
import defpackage.edeq;
import defpackage.edjk;
import defpackage.edjl;
import defpackage.edjs;
import defpackage.eiig;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AccountCard extends FrameLayout {
    public final CardView a;
    private final CircularImageView b;
    private final TextView c;
    private final TextView d;
    private final TextView e;

    public AccountCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = inflate(context, R.layout.smartdevice_account_card_contents, this);
        CardView cardView = (CardView) inflate.findViewById(R.id.account_card_view);
        this.a = cardView;
        this.b = (CircularImageView) inflate.findViewById(R.id.particle_disc);
        TextView textView = (TextView) inflate.findViewById(R.id.sud_items_title);
        this.c = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.sud_items_summary);
        this.d = textView2;
        TextView textView3 = (TextView) inflate.findViewById(R.id.account_error_message);
        this.e = textView3;
        int i = edjs.a;
        if (edeq.z(context)) {
            edjk.b(textView);
            textView2.setTypeface(textView.getTypeface());
            textView3.setTypeface(textView.getTypeface());
            edjl.a(cardView);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.account_card_content_layout);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.smartdevice_account_card_bluechip_padding);
            linearLayout.setPadding(linearLayout.getPaddingLeft(), dimensionPixelSize, linearLayout.getPaddingRight(), dimensionPixelSize);
        }
    }

    public final void a(ParcelableDeviceOwner parcelableDeviceOwner) {
        eiig.x(parcelableDeviceOwner);
        Bitmap bitmap = parcelableDeviceOwner.e;
        if (bitmap != null) {
            this.b.setImageBitmap(bitmap);
        } else {
            this.b.setImageResource(2131232802);
        }
        String str = parcelableDeviceOwner.b;
        if (str == null) {
            this.c.setVisibility(8);
        }
        TextView textView = this.c;
        textView.setText(str);
        TextView textView2 = this.d;
        textView2.setText(parcelableDeviceOwner.a);
        textView2.setSelected(true);
        this.e.setVisibility(true != parcelableDeviceOwner.f ? 0 : 8);
        if (!parcelableDeviceOwner.f) {
            int color = getResources().getColor(R.color.sud_system_tertiary_text_inactive);
            textView.setTextColor(color);
            textView2.setTextColor(color);
        }
        invalidate();
        requestLayout();
    }

    public final void b() {
        this.a.lk(getResources().getColor(android.R.color.transparent));
    }
}
