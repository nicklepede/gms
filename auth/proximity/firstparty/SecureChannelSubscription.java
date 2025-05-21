package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import defpackage.acno;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.asnj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SecureChannelSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new acno();
    public final PendingIntent a;
    public final String b;
    public final int c;
    public final List d;
    public final String e;

    public SecureChannelSubscription(PendingIntent pendingIntent, String str, int i, List list, String str2) {
        arwm.s(pendingIntent);
        this.a = pendingIntent;
        arwm.s(str);
        this.b = str;
        arwm.b(!str.isEmpty());
        arwm.b(Role.f(i));
        this.c = i;
        arwm.s(list);
        this.d = list;
        arwm.b(!list.isEmpty());
        arwm.s(str2);
        this.e = str2;
        arwm.b(!str2.isEmpty());
    }

    @Override // com.google.android.gms.auth.proximity.firstparty.Subscription
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.gms.auth.proximity.firstparty.Subscription
    public final String b() {
        return this.e;
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                JSONObject jSONObject = new JSONObject((String) it.next());
                String string = jSONObject.getString("i");
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(new RemoteDevice(3, string, jSONObject.getString("n"), jSONObject.getString("a"), asnj.e(string), "", arrayList2, jSONObject.getString("t"), null));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SecureChannelSubscription secureChannelSubscription = (SecureChannelSubscription) obj;
            if (this.a.equals(secureChannelSubscription.a) && this.b.equals(secureChannelSubscription.b) && this.c == secureChannelSubscription.c && this.d.equals(secureChannelSubscription.d) && this.e.equals(secureChannelSubscription.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        return String.format(Locale.US, "SecureChannelSubscription{mCallbackIntent=%s, mFeatureName=%s, mConnectionMode=%d, mSerializedDevices=%s, mPackageName=%s}", this.a, this.b, Integer.valueOf(this.c), this.d, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, pendingIntent, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.x(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}
