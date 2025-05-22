package com.google.android.gms.wearable.backup.wear;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wearable.backup.wear.WearBackupConfirmationChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.auad;
import defpackage.dlxc;
import defpackage.dmer;
import defpackage.dmes;
import defpackage.dmet;
import defpackage.dmeu;
import defpackage.dmhk;
import defpackage.rxs;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class WearBackupConfirmationChimeraActivity extends ryt {
    private static final auad j = new dlxc("WearBackupConfirmation");
    private static final dmer k;
    private static final dmer l;
    private static final dmer m;

    static {
        dmes dmesVar = new dmes();
        dmesVar.d(0.125f);
        dmesVar.b(0.208f);
        dmesVar.c(0.0f);
        dmet a = dmesVar.a();
        dmes dmesVar2 = new dmes();
        dmesVar2.d(0.122f);
        dmesVar2.b(0.208f);
        dmesVar2.c(0.0f);
        k = new dmer(a, dmesVar2.a());
        dmes dmesVar3 = new dmes();
        dmesVar3.d(0.0f);
        dmesVar3.b(0.0f);
        dmesVar3.c(0.094f);
        dmet a2 = dmesVar3.a();
        dmes dmesVar4 = new dmes();
        dmesVar4.d(0.0f);
        dmesVar4.b(0.0f);
        dmesVar4.c(0.056f);
        l = new dmer(a2, dmesVar4.a());
        dmes dmesVar5 = new dmes();
        dmesVar5.d(0.0f);
        dmesVar5.b(0.0f);
        dmesVar5.c(0.052f);
        dmet a3 = dmesVar5.a();
        dmes dmesVar6 = new dmes();
        dmesVar6.d(0.0f);
        dmesVar6.b(0.0f);
        dmesVar6.c(0.028f);
        m = new dmer(a3, dmesVar6.a());
    }

    static aca a(rxs rxsVar, aby abyVar) {
        return rxsVar.registerForActivityResult(new dmhk(), abyVar);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        auad auadVar = j;
        auadVar.j("onCreate", new Object[0]);
        setContentView(R.layout.wear_backup_confirmation_activity);
        dmeu.b(this, findViewById(R.id.container), k);
        dmeu.b(this, findViewById(R.id.text_container), l);
        dmeu.b(this, findViewById(R.id.chip_btn_container), m);
        ((TextView) findViewById(R.id.confirmation_title)).setText(getIntent().getStringExtra("confirmation_title"));
        TextView textView = (TextView) findViewById(R.id.confirmation_content);
        if (getIntent().hasExtra("confirmation_content")) {
            textView.setText(getIntent().getStringExtra("confirmation_content"));
        } else {
            textView.setVisibility(8);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: dmhi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WearBackupConfirmationChimeraActivity.this.finish();
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: dmhj
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
            auadVar.f("Unknown ButtonStyle", new Object[0]);
            finish();
        } else {
            ((ImageButton) findViewById(R.id.single_round_cancel_btn)).setOnClickListener(onClickListener);
            findViewById(R.id.single_round_btn_container).setVisibility(0);
        }
    }
}
