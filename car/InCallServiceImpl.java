package com.google.android.gms.car;

import android.content.Intent;
import android.os.IBinder;
import android.telecom.Phone;
import com.google.android.chimera.InCallService;
import defpackage.akpo;
import defpackage.aktu;
import defpackage.akub;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class InCallServiceImpl extends InCallService {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // com.google.android.chimera.InCallService, com.google.android.chimera.Service
    public IBinder onBind(Intent intent) {
        return "local_action".equals(intent.getAction()) ? new aktu(this) : super.onBind(intent);
    }

    @Override // com.google.android.chimera.InCallService
    public final void onPhoneCreated(Phone phone) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            akpo akpoVar = (akpo) it.next();
            akpoVar.a.B(new akub(phone));
        }
    }

    @Override // com.google.android.chimera.InCallService
    public final void onPhoneDestroyed(Phone phone) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            akpo akpoVar = (akpo) it.next();
            new akub(phone);
            akpoVar.a.B(null);
        }
    }

    @Override // com.google.android.chimera.InCallService, com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        super.onUnbind(intent);
        return true;
    }
}
