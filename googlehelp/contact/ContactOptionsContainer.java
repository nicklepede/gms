package com.google.android.gms.googlehelp.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.material.button.MaterialButton;
import defpackage.bkwv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ContactOptionsContainer extends LinearLayout {
    public static final String a = "gH_ContactOptsContainer-".concat(String.valueOf(bkwv.class.getSimpleName()));
    public int b;
    public boolean c;
    public HelpChimeraActivity d;
    public HelpConfig e;
    public MaterialButton f;

    public ContactOptionsContainer(Context context) {
        this(context, null);
    }

    public ContactOptionsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.gh_contact_options_content, (ViewGroup) this, true);
    }
}
