package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.atzr;
import defpackage.aulm;
import defpackage.dfrl;
import defpackage.elgt;
import defpackage.eoek;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WorkProfilePayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dfrl();
    private static final Map f;
    final Set a;
    public String b;
    public int c;
    public AccountBootstrapPayload d;
    public String e;

    static {
        elgt elgtVar = new elgt();
        elgtVar.i("accountName", new FastJsonResponse$Field(7, false, 7, false, "accountName", 2, null));
        elgtVar.i("managementMode", new FastJsonResponse$Field(0, false, 0, false, "managementMode", 3, null));
        elgtVar.i("accountPayload", new FastJsonResponse$Field(11, false, 11, false, "accountPayload", 4, AccountBootstrapPayload.class));
        elgtVar.i("sourceId", new FastJsonResponse$Field(7, false, 7, false, "sourceId", 5, null));
        f = elgtVar.b();
    }

    public WorkProfilePayload(Set set, String str, int i, AccountBootstrapPayload accountBootstrapPayload, String str2) {
        this.a = set;
        this.b = str;
        this.c = i;
        this.d = accountBootstrapPayload;
        this.e = str2;
    }

    public static WorkProfilePayload p(String str, int i, String str2) {
        return new WorkProfilePayload(str, i - 1, str2);
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return Integer.valueOf(this.c);
        }
        if (i == 4) {
            return this.d;
        }
        if (i == 5) {
            return this.e;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.aulm
    public final Map b() {
        return f;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = str2;
        } else {
            if (i != 5) {
                throw new IllegalStateException();
            }
            this.e = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
        if (fastJsonResponse$Field.g != 4) {
            throw new IllegalStateException();
        }
        this.d = (AccountBootstrapPayload) aulmVar;
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 3) {
            throw new IllegalStateException();
        }
        this.c = i;
        this.a.add(Integer.valueOf(i2));
    }

    public final int q() {
        return eoek.a(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            atzr.o(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            atzr.t(parcel, 4, this.d, i, true);
        }
        if (set.contains(5)) {
            atzr.v(parcel, 5, this.e, true);
        }
        atzr.c(parcel, a);
    }

    public WorkProfilePayload() {
        this.a = new HashSet();
    }

    public WorkProfilePayload(String str, int i, String str2) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = str;
        hashSet.add(2);
        this.c = i;
        hashSet.add(3);
        this.e = str2;
        hashSet.add(5);
    }
}
