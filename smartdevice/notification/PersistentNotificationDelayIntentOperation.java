package com.google.android.gms.smartdevice.notification;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.IntentOperation;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.asbo;
import defpackage.denq;
import defpackage.dfee;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class PersistentNotificationDelayIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final arxo b = new denq(new String[]{"Notification", "PersistentNotificationDelayIntentOperation"});

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        arxo arxoVar = b;
        arxoVar.j("onHandleIntent", new Object[0]);
        arxoVar.j("Action: ".concat(String.valueOf(intent.getAction())), new Object[0]);
        if ("com.google.android.gms.smartdevice.notification.PersistentNotificationDelayIntentOperation.ACTION".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("tag");
            arwm.s(stringExtra);
            int intExtra = intent.getIntExtra("id", 0);
            byte[] byteArrayExtra = intent.getByteArrayExtra("notification_bytes");
            arwm.s(byteArrayExtra);
            Parcelable.Creator creator = SerializableNotification.CREATOR;
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            SerializableNotification serializableNotification = (SerializableNotification) SerializableNotification.CREATOR.createFromParcel(obtain);
            asbo f = asbo.f(this);
            arwm.s(f);
            arxoVar.j("Showing notification (tag=%s, id=%s)", stringExtra, Integer.valueOf(intExtra));
            f.w(stringExtra, intExtra, dfee.SMARTDEVICE_TAP_AND_GO, serializableNotification.a(this));
        }
    }
}
