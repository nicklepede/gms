package com.google.android.gms.smartdevice.d2d.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.R;
import defpackage.izo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class DeviceListItemView extends CardView {
    public TextView g;

    public DeviceListItemView(Context context) {
        super(context);
    }

    public final void f(String str) {
        this.g.setText(str);
        int dimension = (int) getResources().getDimension(R.dimen.smartdevice_device_list_item_text_size);
        this.g.setGravity(16);
        izo.j(this.g, dimension);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(android.R.id.text2);
        this.g = textView;
        if (textView == null) {
            throw new IllegalStateException();
        }
        Resources.Theme theme = getContext().getTheme();
        TypedValue typedValue = new TypedValue();
        int i = theme.resolveAttribute(R.attr.colorAccent, typedValue, true) ? typedValue.data : -1;
        if (i != -1) {
            izo.d(this.g, ColorStateList.valueOf(i));
            izo.e(this.g, PorterDuff.Mode.SRC_ATOP);
        }
        findViewById(R.id.center_aligned_layout).setVisibility(8);
    }

    public DeviceListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeviceListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
