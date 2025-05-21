package com.google.android.gms.wearable.backup.wear;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wearable.backup.wear.WearBackupConfirmationChimeraActivity;
import defpackage.abt;
import defpackage.abv;
import defpackage.arxo;
import defpackage.djlj;
import defpackage.djsy;
import defpackage.djsz;
import defpackage.djta;
import defpackage.djtb;
import defpackage.djvr;
import defpackage.qeo;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class WearBackupConfirmationChimeraActivity extends qfp {
    private static final arxo j = new djlj("WearBackupConfirmation");
    private static final djsy k;
    private static final djsy l;
    private static final djsy m;

    static {
        djsz djszVar = new djsz();
        djszVar.d(0.125f);
        djszVar.b(0.208f);
        djszVar.c(0.0f);
        djta a = djszVar.a();
        djsz djszVar2 = new djsz();
        djszVar2.d(0.122f);
        djszVar2.b(0.208f);
        djszVar2.c(0.0f);
        k = new djsy(a, djszVar2.a());
        djsz djszVar3 = new djsz();
        djszVar3.d(0.0f);
        djszVar3.b(0.0f);
        djszVar3.c(0.094f);
        djta a2 = djszVar3.a();
        djsz djszVar4 = new djsz();
        djszVar4.d(0.0f);
        djszVar4.b(0.0f);
        djszVar4.c(0.056f);
        l = new djsy(a2, djszVar4.a());
        djsz djszVar5 = new djsz();
        djszVar5.d(0.0f);
        djszVar5.b(0.0f);
        djszVar5.c(0.052f);
        djta a3 = djszVar5.a();
        djsz djszVar6 = new djsz();
        djszVar6.d(0.0f);
        djszVar6.b(0.0f);
        djszVar6.c(0.028f);
        m = new djsy(a3, djszVar6.a());
    }

    static abv a(qeo qeoVar, abt abtVar) {
        return qeoVar.registerForActivityResult(new djvr(), abtVar);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        arxo arxoVar = j;
        arxoVar.j("onCreate", new Object[0]);
        setContentView(R.layout.wear_backup_confirmation_activity);
        djtb.b(this, findViewById(R.id.container), k);
        djtb.b(this, findViewById(R.id.text_container), l);
        djtb.b(this, findViewById(R.id.chip_btn_container), m);
        ((TextView) findViewById(R.id.confirmation_title)).setText(getIntent().getStringExtra("confirmation_title"));
        TextView textView = (TextView) findViewById(R.id.confirmation_content);
        if (getIntent().hasExtra("confirmation_content")) {
            textView.setText(getIntent().getStringExtra("confirmation_content"));
        } else {
            textView.setVisibility(8);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: djvp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WearBackupConfirmationChimeraActivity.this.finish();
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: djvq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent putExtra = new Intent().putExtra("confirm_pressed", true);
                WearBackupConfirmationChimeraActivity wearBackupConfirmationChimeraActivity = WearBackupConfirmationChimeraActivity.this;
                wearBackupConfirmationChimeraActivity.setResult(-1, putExtra);
                wearBackupConfirmationChimeraActivity.finish();
            }
        };
        int intExtra = getIntent().getIntExtra("button_style", 0);
        if (intExtra == 0) {
            ((ImageButton) findViewById(R.id.round_cancel_btn)).setOnClickListener(onClickListener);
            ((ImageButton) findViewById(R.id.round_confirm_btn)).setOnClickListener(onClickListener2);
            findViewById(R.id.round_btn_container).setVisibility(0);
        } else if (intExtra == 1) {
            ((Button) findViewById(R.id.chip_confirm_btn)).setOnClickListener(onClickListener2);
            ((Button) findViewById(R.id.chip_cancel_btn)).setOnClickListener(onClickListener);
            findViewById(R.id.chip_btn_container).setVisibility(0);
        } else if (intExtra != 2) {
            arxoVar.f("Unknown ButtonStyle", new Object[0]);
            finish();
        } else {
            ((ImageButton) findViewById(R.id.single_round_cancel_btn)).setOnClickListener(onClickListener);
            findViewById(R.id.single_round_btn_container).setVisibility(0);
        }
    }
}
