package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.aulm;
import defpackage.dgob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ExchangeSessionCheckpointsForUserCredentialsRequest extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dgob();
    private static final HashMap d;
    public final Set a;
    public ArrayList b;
    public DeviceRiskSignals c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("sessionCheckpoints", new FastJsonResponse$Field(11, true, 11, true, "sessionCheckpoints", 2, SessionCheckpoint.class));
        hashMap.put("targetDeviceRiskSignals", new FastJsonResponse$Field(11, false, 11, false, "targetDeviceRiskSignals", 3, DeviceRiskSignals.class));
    }

    public ExchangeSessionCheckpointsForUserCredentialsRequest(Set set, ArrayList arrayList, DeviceRiskSignals deviceRiskSignals) {
        this.a = set;
        this.b = arrayList;
        this.c = deviceRiskSignals;
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
        this.c = (DeviceRiskSignals) aulmVar;
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
        atzr.c(parcel, a);
    }

    public ExchangeSessionCheckpointsForUserCredentialsRequest() {
        this.a = new HashSet();
    }

    public ExchangeSessionCheckpointsForUserCredentialsRequest(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = arrayList;
        this.c = null;
        hashSet.add(2);
        hashSet.add(3);
    }
}
