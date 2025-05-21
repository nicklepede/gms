package com.google.android.gms.auth.proximity.phonehub;

import android.app.PendingIntent;
import android.companion.AssociationRequest;
import android.companion.CompanionDeviceManager;
import android.companion.CompanionDeviceManager$Callback;
import android.content.Intent;
import android.os.Bundle;
import defpackage.actv;
import defpackage.adas;
import defpackage.arxo;
import defpackage.crz$$ExternalSyntheticApiModelOutline0;
import defpackage.eiif;
import defpackage.eiig;
import defpackage.flcw;
import defpackage.qfp;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CdmAssociationChimeraActivity extends qfp {
    public static final arxo j = new arxo("ProximityAuth", "CdmActivity");
    public final List k = DesugarCollections.synchronizedList(new ArrayList());
    CompanionDeviceManager$Callback l;
    boolean m;
    private CompanionDeviceManager n;
    private String o;
    private PendingIntent p;
    private String q;

    public final void a(adas adasVar, String str) {
        PendingIntent pendingIntent;
        j.h("Sending setup result to service: %s", adasVar);
        if (!flcw.w() || (pendingIntent = this.p) == null) {
            return;
        }
        try {
            pendingIntent.send(getApplicationContext(), 0, PhoneHubUpdateSetupResultIntentOperation.a(this.o, adasVar.a(), adasVar.a(), this.q, true, str));
        } catch (PendingIntent.CanceledException e) {
            j.n("Failed to launch pending intent.", e, new Object[0]);
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = crz$$ExternalSyntheticApiModelOutline0.m279m(getSystemService(crz$$ExternalSyntheticApiModelOutline0.m()));
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
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
        if (eiif.c(stringExtra2)) {
            j.m("Missing account name, unable to associate with CDM.", new Object[0]);
            return;
        }
        this.o = stringExtra2;
        arxo arxoVar = j;
        arxoVar.h("Handle association intent for account: %s device: %s", stringExtra2, stringExtra);
        this.m = true;
        eiig.x(stringExtra2);
        List list = this.k;
        if (!list.isEmpty()) {
            arxoVar.m("Found ongoing CDM association requests: %d", Integer.valueOf(list.size()));
            return;
        }
        if (true == eiif.c(stringExtra)) {
            stringExtra = "Chromebook";
        }
        forceConfirmation = new AssociationRequest.Builder().setForceConfirmation(true);
        displayName = forceConfirmation.setDisplayName(stringExtra);
        selfManaged = displayName.setSelfManaged(true);
        deviceProfile = selfManaged.setDeviceProfile("android.app.role.COMPANION_DEVICE_COMPUTER");
        build = deviceProfile.build();
        list.add(build);
        this.l = new actv(this, build);
        this.n.associate(build, getMainExecutor(), this.l);
    }
}
