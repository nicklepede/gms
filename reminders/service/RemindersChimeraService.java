package com.google.android.gms.reminders.service;

import android.accounts.Account;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.czno;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RemindersChimeraService extends bzot {
    public RemindersChimeraService() {
        super(18, "com.google.android.gms.reminders.service.START", Collections.EMPTY_SET, 1, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzpe l = l();
        Account account = getServiceRequest.j;
        bzozVar.c(new czno(l, account == null ? null : account.name, getServiceRequest.f, getServiceRequest.p));
    }
}
