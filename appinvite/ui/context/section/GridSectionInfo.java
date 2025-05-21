package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;
import defpackage.tyj;
import defpackage.tyv;
import defpackage.tzc;
import defpackage.tzv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GridSectionInfo extends LoaderSectionInfo {
    public static final Parcelable.Creator CREATOR = new tzv();

    public GridSectionInfo(Parcel parcel) {
        super(parcel);
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final tyv a(tyj tyjVar, int i) {
        tzc tzcVar = new tzc(tyjVar, R.layout.appinvite_contextual_selection_grid_item, i, false, this.i, false);
        tzcVar.U(this.g, this.h);
        return tzcVar;
    }

    public GridSectionInfo(String str) {
        super(str);
    }
}
