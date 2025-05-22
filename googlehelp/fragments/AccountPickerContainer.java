package com.google.android.gms.googlehelp.fragments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class AccountPickerContainer extends LinearLayout {
    public AccountPickerContainer(Context context) {
        this(context, null);
    }

    public AccountPickerContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.gh_account_picker_content, (ViewGroup) this, true);
    }
}
