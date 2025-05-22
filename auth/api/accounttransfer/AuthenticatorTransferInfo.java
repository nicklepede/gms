package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import defpackage.a;
import defpackage.atzr;
import defpackage.bsl;
import defpackage.xkt;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthenticatorTransferInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new xkt();
    private static final HashMap h;
    final Set a;
    final int b;
    public String c;
    public int d;
    public byte[] e;
    public PendingIntent f;
    public DeviceMetaData g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("accountType", new FastJsonResponse$Field(7, false, 7, false, "accountType", 2, null));
        hashMap.put("status", new FastJsonResponse$Field(0, false, 0, false, "status", 3, null));
        hashMap.put("transferBytes", new FastJsonResponse$Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public AuthenticatorTransferInfo(Set set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = bArr;
        this.f = pendingIntent;
        this.g = deviceMetaData;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return Integer.valueOf(this.d);
        }
        if (i == 4) {
            return this.e;
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return h;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.c = str2;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 3) {
            throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
        }
        this.d = i;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.aulm
    protected final void gu(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.g;
        if (i != 4) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a byte array."));
        }
        this.e = bArr;
        this.a.add(Integer.valueOf(i));
    }

    public final void j(PendingIntent pendingIntent) {
        this.f = pendingIntent;
        if (pendingIntent == null) {
            this.a.remove(6);
        } else {
            this.a.add(6);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(1)) {
            atzr.o(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            atzr.v(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            atzr.o(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            atzr.i(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            atzr.t(parcel, 5, this.f, i, true);
        }
        if (set.contains(6)) {
            atzr.t(parcel, 6, this.g, i, true);
        }
        atzr.c(parcel, a);
    }

    public AuthenticatorTransferInfo() {
        this.a = new bsl(3);
        this.b = 1;
    }
}
