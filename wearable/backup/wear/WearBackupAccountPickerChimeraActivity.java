package com.google.android.gms.wearable.backup.wear;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.gms.wearable.backup.wear.WearBackupAccountPickerChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.auad;
import defpackage.dlxc;
import defpackage.dmeu;
import defpackage.dmgp;
import defpackage.rxs;
import defpackage.ryt;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class WearBackupAccountPickerChimeraActivity extends ryt {
    public static final auad j = new dlxc("WearBackupAccountPicker");

    static aca a(rxs rxsVar, aby abyVar) {
        return rxsVar.registerForActivityResult(new dmgp(), abyVar);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        auad auadVar = j;
        auadVar.j("onCreate", new Object[0]);
        setContentView(R.layout.wear_backup_account_picker_activity);
        dmeu.a(this, findViewById(R.id.container));
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("account_names");
        Objects.requireNonNull(stringArrayListExtra, "Account names extra is required");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.account_list);
        for (int i = 0; i < stringArrayListExtra.size(); i++) {
            final String str = stringArrayListExtra.get(i);
            auadVar.h("Displaying account: %s", auad.q(str));
            getLayoutInflater().inflate(R.layout.wear_account_button, linearLayout);
            Button button = (Button) linearLayout.getChildAt(i);
            button.setText(str);
            button.setOnClickListener(new View.OnClickListener() { // from class: dmgm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    auad auadVar2 = WearBackupAccountPickerChimeraActivity.j;
                    String str2 = str;
                    auadVar2.h("Account selected: %s", auad.q(str2));
                    Intent putExtra = new Intent().putExtra("selected_account_name", str2);
                    WearBackupAccountPickerChimeraActivity wearBackupAccountPickerChimeraActivity = WearBackupAccountPickerChimeraActivity.this;
                    wearBackupAccountPickerChimeraActivity.setResult(-1, putExtra);
                    wearBackupAccountPickerChimeraActivity.finish();
                }
            });
        }
    }
}
