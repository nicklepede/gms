package com.google.android.gms.contactinteractions.service.operations;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService;
import defpackage.asqg;
import defpackage.atnn;
import defpackage.atno;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ContactInteractionsPhenotypeChangedIntentOperation extends IntentOperation {
    static final String a = asqg.f("com.google.android.gms.contactinteractions");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (intent != null) {
            if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && "com.google.android.gms.contactinteractions".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                int i = ContactInteractionsChimeraTaskService.a;
                ContactInteractionsChimeraTaskService.g(this, new atno(this, new atnn() { // from class: atnj
                    @Override // defpackage.atnn
                    public final apul a() {
                        return ContactInteractionsChimeraTaskService.e(this);
                    }
                }));
            }
        }
    }
}
