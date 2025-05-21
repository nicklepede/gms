package com.google.android.gms.people.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cugt;
import defpackage.eits;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ContactsSyncThirdPartyChimeraService extends bxgd {
    public ContactsSyncThirdPartyChimeraService() {
        super(new int[]{AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS}, new String[]{"com.google.android.gms.people.contactssync.service.THIRD_PARTY_START"}, Collections.EMPTY_SET, 3, 10, 4, (eits) null);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new cugt(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
