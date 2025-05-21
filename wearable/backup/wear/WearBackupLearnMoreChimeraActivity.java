package com.google.android.gms.wearable.backup.wear;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wearable.backup.wear.WearBackupLearnMoreChimeraActivity;
import defpackage.arxo;
import defpackage.djlh;
import defpackage.djli;
import defpackage.djlj;
import defpackage.djtb;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WearBackupLearnMoreChimeraActivity extends qfp {
    public static final /* synthetic */ int j = 0;
    private static final arxo k = new djlj("WearBackupLearnMore");

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k.j("onCreate", new Object[0]);
        setContentView(R.layout.wear_backup_learn_more_activity);
        djtb.a(this, findViewById(R.id.container));
        TextView textView = (TextView) findViewById(R.id.storage_quota_header);
        if (getIntent().getLongExtra("total_quota_bytes", 0L) == 0) {
            textView.setText(getString(R.string.backup_opt_in_default_storage_header));
        } else {
            textView.setText(getString(R.string.backup_opt_in_storage_header, new Object[]{djlh.b(this, getIntent().getLongExtra("total_quota_bytes", 0L))}));
        }
        ((Button) findViewById(R.id.close_btn)).setOnClickListener(new View.OnClickListener() { // from class: djvu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WearBackupLearnMoreChimeraActivity.this.finish();
            }
        });
        djli.a((TextView) findViewById(R.id.storage_quota_body));
    }
}
