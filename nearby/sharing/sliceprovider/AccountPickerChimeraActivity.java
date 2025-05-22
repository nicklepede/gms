package com.google.android.gms.nearby.sharing.sliceprovider;

import android.accounts.Account;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.nearby.sharing.sliceprovider.AccountPickerChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.ctuq;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class AccountPickerChimeraActivity extends rxx {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aca registerForActivityResult = registerForActivityResult(new acq(), new aby() { // from class: ctrf
            @Override // defpackage.aby
            public final void jF(Object obj) {
                Account a;
                ActivityResult activityResult = (ActivityResult) obj;
                int i = activityResult.a;
                AccountPickerChimeraActivity accountPickerChimeraActivity = AccountPickerChimeraActivity.this;
                if (i == -1 && (a = ctuq.a(activityResult.b)) != null) {
                    chdw.e(accountPickerChimeraActivity).x(a);
                }
                accountPickerChimeraActivity.finish();
            }
        });
        if (bundle == null) {
            ctuq.m(this, (Account) getIntent().getParcelableExtra("com.google.android.gms.nearby.sharing.ACCOUNT"), registerForActivityResult);
        }
    }
}
