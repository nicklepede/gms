package com.google.android.gms.wearable.backup.wear;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wearable.backup.wear.WearBackupDialogChimeraActivity;
import defpackage.auad;
import defpackage.dlxc;
import defpackage.dmer;
import defpackage.dmes;
import defpackage.dmet;
import defpackage.dmeu;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class WearBackupDialogChimeraActivity extends ryt {
    private static final auad j = new dlxc("WearBackupDialog");
    private static final dmer k;

    static {
        dmes dmesVar = new dmes();
        dmesVar.d(0.125f);
        dmesVar.b(0.063f);
        dmesVar.c(0.094f);
        dmet a = dmesVar.a();
        dmes dmesVar2 = new dmes();
        dmesVar2.d(0.122f);
        dmesVar2.b(0.067f);
        dmesVar2.c(0.056f);
        k = new dmer(a, dmesVar2.a());
    }

    static Intent a(String str) {
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.wear.WearBackupDialogActivity").putExtra("dialog_label", str);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.j("onCreate", new Object[0]);
        setContentView(R.layout.wear_backup_dialog_activity);
        dmeu.b(this, findViewById(R.id.container), k);
        ((TextView) findViewById(R.id.dialog_label)).setText(getIntent().getStringExtra("dialog_label"));
        ((ImageButton) findViewById(R.id.dismiss_btn)).setOnClickListener(new View.OnClickListener() { // from class: dmhm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WearBackupDialogChimeraActivity.this.finish();
            }
        });
    }
}
