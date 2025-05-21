package com.google.android.gms.nearby.sharing.sliceprovider;

import android.accounts.Account;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.nearby.sharing.sliceprovider.AccountPickerChimeraActivity;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.crll;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AccountPickerChimeraActivity extends qet {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abv registerForActivityResult = registerForActivityResult(new acl(), new abt() { // from class: crib
            @Override // defpackage.abt
            public final void jq(Object obj) {
                Account a;
                ActivityResult activityResult = (ActivityResult) obj;
                int i = activityResult.a;
                AccountPickerChimeraActivity accountPickerChimeraActivity = AccountPickerChimeraActivity.this;
                if (i == -1 && (a = crll.a(activityResult.b)) != null) {
                    cewl.e(accountPickerChimeraActivity).x(a);
                }
                accountPickerChimeraActivity.finish();
            }
        });
        if (bundle == null) {
            crll.m(this, (Account) getIntent().getParcelableExtra("com.google.android.gms.nearby.sharing.ACCOUNT"), registerForActivityResult);
        }
    }
}
