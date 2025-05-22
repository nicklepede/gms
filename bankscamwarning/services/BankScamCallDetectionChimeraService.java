package com.google.android.gms.bankscamwarning.services;

import android.telecom.Call;
import android.telecom.Phone;
import com.google.android.chimera.InCallService;
import com.google.android.gms.bankscamwarning.services.BankScamCallDetectionChimeraService;
import defpackage.amnq;
import defpackage.amns;
import defpackage.auid;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.funt;
import defpackage.fxqp;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class BankScamCallDetectionChimeraService extends InCallService {
    public static final ausn a = ausn.b("BankScamCallService", auid.BANK_SCAM_WARNING);
    private final fxqu b = new fxre(new fxwd() { // from class: amnr
        @Override // defpackage.fxwd
        public final Object a() {
            fxuv fxuvVar = bsxe.a;
            return new amnq(BankScamCallDetectionChimeraService.this, bsxe.d);
        }
    });

    public final amnq a() {
        return (amnq) this.b.a();
    }

    @Override // com.google.android.chimera.InCallService
    public final void onCallAdded(Call call) {
        if (!funt.c() || call == null) {
            return;
        }
        call.registerCallback(new amns(this));
    }

    @Override // com.google.android.chimera.InCallService
    public final void onCallRemoved(Call call) {
        if (funt.c()) {
            ((eluo) a.h()).x("onCallRemoved called. Stopping scam detection.");
            a().a();
        }
    }

    @Override // com.google.android.chimera.InCallService
    @fxqp
    public final void onPhoneCreated(Phone phone) {
    }

    @Override // com.google.android.chimera.InCallService
    @fxqp
    public final void onPhoneDestroyed(Phone phone) {
    }
}
