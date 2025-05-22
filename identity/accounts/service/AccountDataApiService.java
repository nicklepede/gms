package com.google.android.gms.identity.accounts.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bogr;
import defpackage.bogs;
import defpackage.bzot;
import defpackage.bzoz;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class AccountDataApiService extends bzot {
    private static final bogs a = new bogr();
    private final bogs b;

    public AccountDataApiService() {
        this(a);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(this.b.a(this));
    }

    public AccountDataApiService(bogs bogsVar) {
        super(9, "com.google.android.gms.accounts.ACCOUNT_SERVICE", Collections.EMPTY_SET, 1, 10);
        this.b = bogsVar;
    }
}
