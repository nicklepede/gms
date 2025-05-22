package com.google.android.gms.vision.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
import defpackage.aqbk;
import defpackage.bblp;
import defpackage.dkmn;
import defpackage.dknq;
import defpackage.dkns;
import defpackage.dknt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes7.dex */
public class DynamiteNativeFaceDetectorCreator extends dkns {
    @Override // defpackage.dknt
    public dknq newFaceDetector(bblp bblpVar, FaceSettingsParcel faceSettingsParcel) {
        Context a = aqbk.a((Context) ObjectWrapper.a(bblpVar), "com.google.android.gms.vision.dynamite");
        if (a == null) {
            dkmn.a("%s could not be loaded.", "com.google.android.gms.vision.dynamite");
            throw new RemoteException();
        }
        dknt asInterface = dkns.asInterface(aqbk.b(a.getClassLoader(), "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
        if (asInterface != null) {
            return asInterface.newFaceDetector(bblpVar, faceSettingsParcel);
        }
        dkmn.a("Could not load Chimera native face detector creator.", new Object[0]);
        throw new RemoteException();
    }
}
