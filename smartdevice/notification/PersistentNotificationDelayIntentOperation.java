package com.google.android.gms.smartdevice.notification;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.IntentOperation;
import defpackage.atzb;
import defpackage.auad;
import defpackage.aued;
import defpackage.dgyt;
import defpackage.dhpk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class PersistentNotificationDelayIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final auad b = new dgyt(new String[]{"Notification", "PersistentNotificationDelayIntentOperation"});

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        auad auadVar = b;
        auadVar.j("onHandleIntent", new Object[0]);
        auadVar.j("Action: ".concat(String.valueOf(intent.getAction())), new Object[0]);
        if ("com.google.android.gms.smartdevice.notification.PersistentNotificationDelayIntentOperation.ACTION".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("tag");
            atzb.s(stringExtra);
            int intExtra = intent.getIntExtra("id", 0);
            byte[] byteArrayExtra = intent.getByteArrayExtra("notification_bytes");
            atzb.s(byteArrayExtra);
            Parcelable.Creator creator = SerializableNotification.CREATOR;
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            SerializableNotification serializableNotification = (SerializableNotification) SerializableNotification.CREATOR.createFromParcel(obtain);
            aued f = aued.f(this);
            atzb.s(f);
            auadVar.j("Showing notification (tag=%s, id=%s)", stringExtra, Integer.valueOf(intExtra));
            f.w(stringExtra, intExtra, dhpk.SMARTDEVICE_TAP_AND_GO, serializableNotification.a(this));
        }
    }
}
