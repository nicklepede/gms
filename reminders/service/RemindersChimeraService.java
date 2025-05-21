package com.google.android.gms.reminders.service;

import android.accounts.Account;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.cxds;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RemindersChimeraService extends bxgd {
    public RemindersChimeraService() {
        super(18, "com.google.android.gms.reminders.service.START", Collections.EMPTY_SET, 1, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgo l = l();
        Account account = getServiceRequest.j;
        bxgjVar.c(new cxds(l, account == null ? null : account.name, getServiceRequest.f, getServiceRequest.p));
    }
}
