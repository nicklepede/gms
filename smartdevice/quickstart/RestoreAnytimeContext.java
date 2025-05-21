package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.ddwk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class RestoreAnytimeContext extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddwk();
    private static final HashMap h;
    public final Set a;
    public String b;
    public String c;
    public int d;
    public List e;
    public boolean f;
    public int g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("expectedSourceDeviceName", new FastJsonResponse$Field(7, false, 7, false, "expectedSourceDeviceName", 1, null));
        hashMap.put("expectedSourceDeviceId", new FastJsonResponse$Field(7, false, 7, false, "expectedSourceDeviceId", 2, null));
        hashMap.put("sourceEligibilityCheckResult", new FastJsonResponse$Field(0, false, 0, false, "sourceEligibilityCheckResult", 3, null));
        hashMap.put("accountsOnTarget", new FastJsonResponse$Field(11, true, 11, true, "accountsOnTarget", 4, BootstrapAccount.class));
        hashMap.put("sourceNotTransferringNewAccount", new FastJsonResponse$Field(6, false, 6, false, "sourceNotTransferringNewAccount", 5, null));
        hashMap.put("targetManagementMode", new FastJsonResponse$Field(0, false, 0, false, "targetManagementMode", 6, null));
    }

    public RestoreAnytimeContext(Set set, String str, String str2, int i, List list, boolean z, int i2) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = list;
        this.f = z;
        this.g = i2;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 1:
                return this.b;
            case 2:
                return this.c;
            case 3:
                return Integer.valueOf(this.d);
            case 4:
                return this.e;
            case 5:
                return Boolean.valueOf(this.f);
            case 6:
                return Integer.valueOf(this.g);
            default:
                throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
        }
    }

    @Override // defpackage.ashs
    public final Map b() {
        return h;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            this.b = str2;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
            }
            this.c = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gg(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i != 5) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a boolean.", Integer.valueOf(i)));
        }
        this.f = z;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    public final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 4) {
            if (arrayList == null) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found Null", Integer.valueOf(i)));
            }
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i), arrayList.getClass().getCanonicalName()));
        }
        this.e = arrayList;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.d = i;
        } else {
            if (i2 != 6) {
                throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be a int."));
            }
            this.g = i;
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(1)) {
            arxc.v(parcel, 1, this.b, true);
        }
        if (set.contains(2)) {
            arxc.v(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            arxc.o(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            arxc.y(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            arxc.e(parcel, 5, this.f);
        }
        if (set.contains(6)) {
            arxc.o(parcel, 6, this.g);
        }
        arxc.c(parcel, a);
    }

    public RestoreAnytimeContext() {
        this.a = new HashSet();
    }

    public RestoreAnytimeContext(int i) {
        this();
        this.d = i;
        this.a.add(3);
    }

    public RestoreAnytimeContext(String str, String str2) {
        this();
        this.b = str;
        this.a.add(1);
        this.c = str2;
        this.a.add(2);
    }
}
