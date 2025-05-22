package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import defpackage.atzr;
import defpackage.bdnf;
import defpackage.bdzw;
import defpackage.bdzx;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ViewOptions extends AbstractSafeParcelable implements bdnf {
    public static final Parcelable.Creator CREATOR = new bdzx();
    private final int a;
    public final Set d;

    public ViewOptions() {
        this(1);
    }

    public JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewName", b().p);
            Set set = this.d;
            if (!set.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((Transport) it.next()).h);
                }
                jSONObject.put("alternateAvailableTransports", jSONArray);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public bdzw b() {
        throw new UnsupportedOperationException("This method must be overwritten by subclasses");
    }

    public int hW() {
        return this.a;
    }

    public final String toString() {
        return a().toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, hW());
        atzr.c(parcel, a);
    }

    public ViewOptions(int i) {
        this.d = new HashSet();
        this.a = i;
    }
}
