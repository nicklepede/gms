package com.google.android.gms.car;

import android.content.Intent;
import android.os.IBinder;
import android.telecom.Phone;
import com.google.android.chimera.InCallService;
import defpackage.amqz;
import defpackage.amvf;
import defpackage.amvm;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class InCallServiceImpl extends InCallService {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // com.google.android.chimera.InCallService, com.google.android.chimera.Service
    public IBinder onBind(Intent intent) {
        return "local_action".equals(intent.getAction()) ? new amvf(this) : super.onBind(intent);
    }

    @Override // com.google.android.chimera.InCallService
    public final void onPhoneCreated(Phone phone) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            amqz amqzVar = (amqz) it.next();
            amqzVar.a.B(new amvm(phone));
        }
    }

    @Override // com.google.android.chimera.InCallService
    public final void onPhoneDestroyed(Phone phone) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            amqz amqzVar = (amqz) it.next();
            new amvm(phone);
            amqzVar.a.B(null);
        }
    }

    @Override // com.google.android.chimera.InCallService, com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        super.onUnbind(intent);
        return true;
    }
}
