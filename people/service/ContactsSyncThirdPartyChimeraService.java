package com.google.android.gms.people.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.cwqa;
import defpackage.elgx;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactsSyncThirdPartyChimeraService extends bzot {
    public ContactsSyncThirdPartyChimeraService() {
        super(new int[]{AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS}, new String[]{"com.google.android.gms.people.contactssync.service.THIRD_PARTY_START"}, Collections.EMPTY_SET, 3, 10, 4, (elgx) null);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new cwqa(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
