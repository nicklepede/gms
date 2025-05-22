package com.google.android.gms.wearable.backup.wear;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import defpackage.ekvl;
import defpackage.tiy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class LoadableTextView extends RelativeLayout {
    private final TextView a;
    private final LinearProgressIndicator b;

    public LoadableTextView(Context context) {
        this(context, null);
    }

    public final void a(int i) {
        b(getContext().getString(i));
    }

    public final void b(CharSequence charSequence) {
        this.b.setVisibility(4);
        TextView textView = this.a;
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.b.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.a.getLayoutParams();
        int gravity = getGravity();
        if (gravity != 17) {
            if (gravity != 8388627) {
                return;
            }
            ekvl.y(layoutParams);
            layoutParams.addRule(15);
            return;
        }
        ekvl.y(layoutParams);
        layoutParams.addRule(13);
        ekvl.y(layoutParams2);
        layoutParams2.addRule(13);
    }

    public LoadableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadableTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public LoadableTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        inflate(context, R.layout.loadable_text_view, this);
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) findViewById(R.id.loading_bar);
        this.b = linearProgressIndicator;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.wear_backup_settings_placeholder_bar_width);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tiy.h, 0, 0);
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, dimensionPixelSize);
            obtainStyledAttributes.recycle();
        }
        linearProgressIndicator.setLayoutParams(new RelativeLayout.LayoutParams(dimensionPixelSize, -2));
        TextView textView = new TextView(context, attributeSet, i, i2);
        this.a = textView;
        textView.setTag("text_view");
        textView.setVisibility(4);
        addView(textView);
    }
}
