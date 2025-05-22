package com.google.android.gms.auth.proximity.phonehub;

import android.app.PendingIntent;
import android.companion.AssociationRequest;
import android.companion.CompanionDeviceManager;
import android.companion.CompanionDeviceManager$Callback;
import android.content.Intent;
import android.os.Bundle;
import defpackage.aetv;
import defpackage.afas;
import defpackage.auad;
import defpackage.csm$$ExternalSyntheticApiModelOutline0;
import defpackage.ekvk;
import defpackage.ekvl;
import defpackage.fnuf;
import defpackage.ryt;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CdmAssociationChimeraActivity extends ryt {
    public static final auad j = new auad("ProximityAuth", "CdmActivity");
    public final List k = DesugarCollections.synchronizedList(new ArrayList());
    CompanionDeviceManager$Callback l;
    boolean m;
    private CompanionDeviceManager n;
    private String o;
    private PendingIntent p;
    private String q;

    public final void a(afas afasVar, String str) {
        PendingIntent pendingIntent;
        j.h("Sending setup result to service: %s", afasVar);
        if (!fnuf.w() || (pendingIntent = this.p) == null) {
            return;
        }
        try {
            pendingIntent.send(getApplicationContext(), 0, PhoneHubUpdateSetupResultIntentOperation.a(this.o, afasVar.a(), afasVar.a(), this.q, true, str));
        } catch (PendingIntent.CanceledException e) {
            j.n("Failed to launch pending intent.", e, new Object[0]);
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = csm$$ExternalSyntheticApiModelOutline0.m276m(getSystemService(csm$$ExternalSyntheticApiModelOutline0.m()));
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        AssociationRequest.Builder forceConfirmation;
        AssociationRequest.Builder displayName;
        AssociationRequest.Builder selfManaged;
        AssociationRequest.Builder deviceProfile;
        AssociationRequest build;
        if (!z || this.m) {
            j.m("Skip handling intent from onWindowFocusChanged due to window is not focus or intent is handled", new Object[0]);
            return;
        }
        Intent intent = getIntent();
        if (!"com.google.android.gms.auth.proximity.phonehub.action.ASSOCIATE_WITH_CDM".equals(intent.getAction())) {
            throw new IllegalArgumentException(String.format("Action not supported. %s", intent.getAction()));
        }
        String stringExtra = intent.getStringExtra("ExtraDeviceName");
        String stringExtra2 = intent.getStringExtra("ExtraAccountName");
        this.q = intent.getStringExtra("ExtraDeviceId");
        this.p = (PendingIntent) intent.getParcelableExtra("ExtraPendingIntent");
        if (ekvk.c(stringExtra2)) {
            j.m("Missing account name, unable to associate with CDM.", new Object[0]);
            return;
        }
        this.o = stringExtra2;
        auad auadVar = j;
        auadVar.h("Handle association intent for account: %s device: %s", stringExtra2, stringExtra);
        this.m = true;
        ekvl.y(stringExtra2);
        List list = this.k;
        if (!list.isEmpty()) {
            auadVar.m("Found ongoing CDM association requests: %d", Integer.valueOf(list.size()));
            return;
        }
        if (true == ekvk.c(stringExtra)) {
            stringExtra = "Chromebook";
        }
        forceConfirmation = new AssociationRequest.Builder().setForceConfirmation(true);
        displayName = forceConfirmation.setDisplayName(stringExtra);
        selfManaged = displayName.setSelfManaged(true);
        deviceProfile = selfManaged.setDeviceProfile("android.app.role.COMPANION_DEVICE_COMPUTER");
        build = deviceProfile.build();
        list.add(build);
        this.l = new aetv(this, build);
        this.n.associate(build, getMainExecutor(), this.l);
    }
}
