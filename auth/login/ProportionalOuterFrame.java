package com.google.android.gms.auth.login;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ProportionalOuterFrame extends RelativeLayout {
    public ProportionalOuterFrame(Context context) {
        super(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = (int) (View.MeasureSpec.getSize(i) * 0.05d);
        setPadding(size, 0, size, (int) (View.MeasureSpec.getSize(i2) * 0.04d));
        View findViewById = findViewById(R.id.title_area);
        if (findViewById != null) {
            findViewById.setMinimumHeight((int) (((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getHeight() * 0.15d));
        }
        super.onMeasure(i, i2);
    }

    public ProportionalOuterFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProportionalOuterFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
