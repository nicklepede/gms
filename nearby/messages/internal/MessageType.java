package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cmmu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MessageType extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmmu();
    final int a;
    public final String b;
    public final String c;

    public MessageType(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MessageType) && hashCode() == obj.hashCode()) {
            MessageType messageType = (MessageType) obj;
            if (atyq.b(this.b, messageType.b) && atyq.b(this.c, messageType.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    public final String toString() {
        return "namespace=" + this.b + ", type=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.c, false);
        atzr.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        atzr.c(parcel, a);
    }

    public MessageType(String str, String str2) {
        this(1, str, str2);
    }
}
