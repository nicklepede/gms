package com.google.android.gms.contactinteractions.service.operations;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService;
import defpackage.auua;
import defpackage.avrq;
import defpackage.avrr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ContactInteractionsPhenotypeChangedIntentOperation extends IntentOperation {
    static final String a = auua.f("com.google.android.gms.contactinteractions");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (intent != null) {
            if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && "com.google.android.gms.contactinteractions".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                int i = ContactInteractionsChimeraTaskService.a;
                ContactInteractionsChimeraTaskService.g(this, new avrr(this, new avrq() { // from class: avrm
                    @Override // defpackage.avrq
                    public final arxc a() {
                        return ContactInteractionsChimeraTaskService.e(this);
                    }
                }));
            }
        }
    }
}
