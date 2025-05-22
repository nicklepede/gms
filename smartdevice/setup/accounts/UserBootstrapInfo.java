package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.dgol;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UserBootstrapInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dgol();
    private static final HashMap d;
    final Set a;
    public String b;
    public byte[] c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("accountIdentifier", new FastJsonResponse$Field(7, false, 7, false, "accountIdentifier", 2, null));
        hashMap.put("userPublicKey", new FastJsonResponse$Field(8, false, 8, false, "userPublicKey", 3, null));
    }

    public UserBootstrapInfo() {
        this.a = new HashSet();
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return d;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBootstrapInfo)) {
            return false;
        }
        UserBootstrapInfo userBootstrapInfo = (UserBootstrapInfo) obj;
        return atyq.b(this.b, userBootstrapInfo.b) && atyq.b(this.c, userBootstrapInfo.c);
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        if (str2 == null) {
            return;
        }
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.b = str2;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gu(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int i = fastJsonResponse$Field.g;
        if (i != 3) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a byte array."));
        }
        this.c = bArr;
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            atzr.i(parcel, 3, this.c, true);
        }
        atzr.c(parcel, a);
    }

    public UserBootstrapInfo(String str, byte[] bArr) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = str;
        this.c = bArr;
        hashSet.add(2);
        hashSet.add(3);
    }

    public UserBootstrapInfo(Set set, String str, byte[] bArr) {
        this.a = set;
        this.b = str;
        atzb.s(bArr);
        this.c = bArr;
    }
}
