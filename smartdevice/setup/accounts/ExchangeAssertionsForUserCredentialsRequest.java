package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.aulm;
import defpackage.dgoa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ExchangeAssertionsForUserCredentialsRequest extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dgoa();
    private static final HashMap k;
    public final Set a;
    public ArrayList b;
    public DeviceSignals c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public int j;

    static {
        HashMap hashMap = new HashMap();
        k = hashMap;
        hashMap.put("assertions", new FastJsonResponse$Field(11, true, 11, true, "assertions", 2, Assertion.class));
        hashMap.put("targetDeviceSignals", new FastJsonResponse$Field(11, false, 11, false, "targetDeviceSignals", 3, DeviceSignals.class));
        hashMap.put("credentialType", new FastJsonResponse$Field(0, false, 0, false, "credentialType", 4, null));
        hashMap.put("clientId", new FastJsonResponse$Field(7, false, 7, false, "clientId", 5, null));
        hashMap.put("locale", new FastJsonResponse$Field(7, false, 7, false, "locale", 6, null));
        hashMap.put("sourceBackupAccountId", new FastJsonResponse$Field(7, false, 7, false, "sourceBackupAccountId", 7, null));
        hashMap.put("sourceAndroidDeviceId", new FastJsonResponse$Field(7, false, 7, false, "sourceAndroidDeviceId", 8, null));
        hashMap.put("deferCredentialsAfterFallback", new FastJsonResponse$Field(6, false, 6, false, "deferCredentialsAfterFallback", 9, null));
        hashMap.put("platformVariant", new FastJsonResponse$Field(0, false, 0, false, "platformVariant", 10, null));
    }

    public ExchangeAssertionsForUserCredentialsRequest(Set set, ArrayList arrayList, DeviceSignals deviceSignals, int i, String str, String str2, String str3, String str4, boolean z, int i2) {
        this.a = set;
        this.b = arrayList;
        this.c = deviceSignals;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = z;
        this.j = i2;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return Integer.valueOf(this.d);
            case 5:
                return this.e;
            case 6:
                return this.f;
            case 7:
                return this.g;
            case 8:
                return this.h;
            case 9:
                return Boolean.valueOf(this.i);
            case 10:
                return Integer.valueOf(this.j);
            default:
                throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
        }
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return k;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i != 5) {
            if (i == 6) {
                this.f = str2;
            } else if (i == 7) {
                this.g = str2;
            } else {
                if (i != 8) {
                    throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
                }
                this.h = str2;
            }
        } else if (str2 == null) {
            return;
        } else {
            this.e = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = arrayList;
            this.a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException("Field with id=" + i + " is not a known array of custom type.  Found " + arrayList.getClass().getCanonicalName() + ".");
    }

    @Override // defpackage.aulm
    public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
        int i = fastJsonResponse$Field.g;
        if (i != 3) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), aulmVar.getClass().getCanonicalName()));
        }
        this.c = (DeviceSignals) aulmVar;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 4) {
            this.d = i;
        } else {
            if (i2 != 10) {
                throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
            }
            this.j = i;
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.aulm
    protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i != 9) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
        }
        this.i = z;
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.y(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            atzr.t(parcel, 3, this.c, i, true);
        }
        if (set.contains(4)) {
            atzr.o(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            atzr.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            atzr.v(parcel, 6, this.f, true);
        }
        if (set.contains(7)) {
            atzr.v(parcel, 7, this.g, true);
        }
        if (set.contains(8)) {
            atzr.v(parcel, 8, this.h, true);
        }
        if (set.contains(9)) {
            atzr.e(parcel, 9, this.i);
        }
        if (set.contains(10)) {
            atzr.o(parcel, 10, this.j);
        }
        atzr.c(parcel, a);
    }

    public ExchangeAssertionsForUserCredentialsRequest() {
        this.a = new HashSet();
    }

    public ExchangeAssertionsForUserCredentialsRequest(ArrayList arrayList, String str, int i) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = arrayList;
        this.c = null;
        this.d = 3;
        this.e = str;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = i;
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(9);
        hashSet.add(10);
    }
}
