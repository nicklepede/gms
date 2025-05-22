package com.google.android.gms.wearable.backup.wear;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wearable.backup.wear.WearBackupLearnMoreChimeraActivity;
import defpackage.auad;
import defpackage.dlxa;
import defpackage.dlxb;
import defpackage.dlxc;
import defpackage.dmeu;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WearBackupLearnMoreChimeraActivity extends ryt {
    public static final /* synthetic */ int j = 0;
    private static final auad k = new dlxc("WearBackupLearnMore");

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k.j("onCreate", new Object[0]);
        setContentView(R.layout.wear_backup_learn_more_activity);
        dmeu.a(this, findViewById(R.id.container));
        TextView textView = (TextView) findViewById(R.id.storage_quota_header);
        if (getIntent().getLongExtra("total_quota_bytes", 0L) == 0) {
            textView.setText(getString(R.string.backup_opt_in_default_storage_header));
        } else {
            textView.setText(getString(R.string.backup_opt_in_storage_header, new Object[]{dlxa.b(this, getIntent().getLongExtra("total_quota_bytes", 0L))}));
        }
        ((Button) findViewById(R.id.close_btn)).setOnClickListener(new View.OnClickListener() { // from class: dmhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WearBackupLearnMoreChimeraActivity.this.finish();
            }
        });
        dlxb.a((TextView) findViewById(R.id.storage_quota_body));
    }
}
