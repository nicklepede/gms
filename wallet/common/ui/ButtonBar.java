package com.google.android.gms.wallet.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import defpackage.eijr;
import defpackage.tiy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ButtonBar extends LinearLayout {
    public Button a;
    public View b;
    public Button c;
    private View d;

    public ButtonBar(Context context) {
        super(context);
        c(context, null);
    }

    private final void c(Context context, AttributeSet attributeSet) {
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.wallet_view_button_bar_dialog, (ViewGroup) this, true);
        this.a = (Button) findViewById(R.id.positive_btn);
        this.b = findViewById(R.id.positive_btn_container);
        this.c = (Button) findViewById(R.id.close_btn);
        this.d = findViewById(R.id.button_progress_spinner);
        Button button = this.a;
        if (button != null) {
            eijr.I(context, button);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tiy.q);
        if (obtainStyledAttributes.hasValue(0)) {
            b(obtainStyledAttributes.getString(0));
        } else {
            b(this.a.getText());
        }
        obtainStyledAttributes.recycle();
    }

    public final void a(boolean z) {
        this.a.setEnabled(z);
        this.c.setEnabled(z);
        if (z) {
            this.d.setVisibility(4);
        } else {
            this.d.setVisibility(0);
        }
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
        if (bundle.containsKey("buttonsEnabled")) {
            a(bundle.getBoolean("buttonsEnabled"));
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putBoolean("buttonsEnabled", this.a.isEnabled());
        return bundle;
    }

    public ButtonBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public ButtonBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet);
    }
}
