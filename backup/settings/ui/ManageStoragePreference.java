package com.google.android.gms.backup.settings.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.ui.ManageStoragePreference;
import defpackage.ajwt;
import defpackage.auad;
import defpackage.fodd;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ManageStoragePreference extends Preference {
    private static final auad d = ajwt.a("ManageStoragePreference");
    public final double a;
    public Button b;
    public Button c;
    private final View.OnClickListener e;

    public ManageStoragePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = fodd.b();
        this.e = new View.OnClickListener() { // from class: alzu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageStoragePreference.this.j.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(fodd.a.lK().C())));
            }
        };
        this.B = R.layout.manage_storage_button;
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        d.j("onBindViewHolder", new Object[0]);
        super.a(mfaVar);
        Button button = (Button) mfaVar.D(R.id.manage_storage_button);
        this.b = button;
        View.OnClickListener onClickListener = this.e;
        button.setOnClickListener(onClickListener);
        Button button2 = (Button) mfaVar.D(R.id.manage_storage_button_filled);
        this.c = button2;
        button2.setOnClickListener(onClickListener);
    }
}
