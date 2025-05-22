package com.google.android.gms.wallet.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.google.android.gms.R;
import defpackage.dkyr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WalletSecureLinearLayout extends LinearLayout {
    public WalletSecureLinearLayout(Context context) {
        super(context);
        a();
    }

    private final void a() {
        dkyr.z(this, true);
    }

    @Override // android.view.View
    public final boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        boolean onFilterTouchEventForSecurity = super.onFilterTouchEventForSecurity(motionEvent);
        if (!onFilterTouchEventForSecurity) {
            Toast.makeText(getContext(), R.string.wallet_screen_blocked, 1).show();
        }
        return onFilterTouchEventForSecurity;
    }

    public WalletSecureLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public WalletSecureLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public WalletSecureLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }
}
