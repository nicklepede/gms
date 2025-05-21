package com.google.android.gms.wearable.backup.wear;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wearable.backup.wear.WearBackupDialogChimeraActivity;
import defpackage.arxo;
import defpackage.djlj;
import defpackage.djsy;
import defpackage.djsz;
import defpackage.djta;
import defpackage.djtb;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class WearBackupDialogChimeraActivity extends qfp {
    private static final arxo j = new djlj("WearBackupDialog");
    private static final djsy k;

    static {
        djsz djszVar = new djsz();
        djszVar.d(0.125f);
        djszVar.b(0.063f);
        djszVar.c(0.094f);
        djta a = djszVar.a();
        djsz djszVar2 = new djsz();
        djszVar2.d(0.122f);
        djszVar2.b(0.067f);
        djszVar2.c(0.056f);
        k = new djsy(a, djszVar2.a());
    }

    static Intent a(String str) {
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.wear.WearBackupDialogActivity").putExtra("dialog_label", str);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.j("onCreate", new Object[0]);
        setContentView(R.layout.wear_backup_dialog_activity);
        djtb.b(this, findViewById(R.id.container), k);
        ((TextView) findViewById(R.id.dialog_label)).setText(getIntent().getStringExtra("dialog_label"));
        ((ImageButton) findViewById(R.id.dismiss_btn)).setOnClickListener(new View.OnClickListener() { // from class: djvt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WearBackupDialogChimeraActivity.this.finish();
            }
        });
    }
}
