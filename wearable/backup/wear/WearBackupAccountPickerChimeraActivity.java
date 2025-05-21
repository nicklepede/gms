package com.google.android.gms.wearable.backup.wear;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.gms.wearable.backup.wear.WearBackupAccountPickerChimeraActivity;
import defpackage.abt;
import defpackage.abv;
import defpackage.arxo;
import defpackage.djlj;
import defpackage.djtb;
import defpackage.djuw;
import defpackage.qeo;
import defpackage.qfp;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class WearBackupAccountPickerChimeraActivity extends qfp {
    public static final arxo j = new djlj("WearBackupAccountPicker");

    static abv a(qeo qeoVar, abt abtVar) {
        return qeoVar.registerForActivityResult(new djuw(), abtVar);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        arxo arxoVar = j;
        arxoVar.j("onCreate", new Object[0]);
        setContentView(R.layout.wear_backup_account_picker_activity);
        djtb.a(this, findViewById(R.id.container));
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("account_names");
        Objects.requireNonNull(stringArrayListExtra, "Account names extra is required");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.account_list);
        for (int i = 0; i < stringArrayListExtra.size(); i++) {
            final String str = stringArrayListExtra.get(i);
            arxoVar.h("Displaying account: %s", arxo.q(str));
            getLayoutInflater().inflate(R.layout.wear_account_button, linearLayout);
            Button button = (Button) linearLayout.getChildAt(i);
            button.setText(str);
            button.setOnClickListener(new View.OnClickListener() { // from class: djut
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    arxo arxoVar2 = WearBackupAccountPickerChimeraActivity.j;
                    String str2 = str;
                    arxoVar2.h("Account selected: %s", arxo.q(str2));
                    Intent putExtra = new Intent().putExtra("selected_account_name", str2);
                    WearBackupAccountPickerChimeraActivity wearBackupAccountPickerChimeraActivity = WearBackupAccountPickerChimeraActivity.this;
                    wearBackupAccountPickerChimeraActivity.setResult(-1, putExtra);
                    wearBackupAccountPickerChimeraActivity.finish();
                }
            });
        }
    }
}
