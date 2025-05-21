package com.google.android.gms.mdi.download.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.gms.R;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.mdi.download.ui.DebugUiChimeraActivity;
import defpackage.aqxo;
import defpackage.arco;
import defpackage.arcy;
import defpackage.cckt;
import defpackage.ccku;
import defpackage.dqjp;
import defpackage.qet;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DebugUiChimeraActivity extends qet {
    public ArrayAdapter j;

    public final void a() {
        aqxo aqxoVar = new aqxo(this, (int[][][]) null);
        arcy arcyVar = new arcy();
        arcyVar.d = 303;
        arcyVar.a = new arco() { // from class: cchb
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                cchu cchuVar = (cchu) obj;
                ccgs ccgsVar = new ccgs((dfau) obj2);
                Context context = cchuVar.r;
                ((ccgw) cchuVar.H()).g(ccgsVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
            }
        };
        aqxoVar.iO(arcyVar.a()).z(new cckt(this));
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        int i = dqjp.a;
        super.onCreate(bundle);
        setContentView(R.layout.mdd_debug_activity);
        setTitle(R.string.mdd_debug_ui_title);
        ((Button) findViewById(R.id.refresh_file_group_list)).setOnClickListener(new View.OnClickListener() { // from class: cckj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugUiChimeraActivity debugUiChimeraActivity = DebugUiChimeraActivity.this;
                aqxo aqxoVar = new aqxo(debugUiChimeraActivity, (int[][][]) null);
                aqxoVar.ah().z(new ccko(debugUiChimeraActivity, aqxoVar));
            }
        });
        ((Button) findViewById(R.id.delete_all_downloaded_files)).setOnClickListener(new View.OnClickListener() { // from class: cckk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugUiChimeraActivity debugUiChimeraActivity = DebugUiChimeraActivity.this;
                aqxo aqxoVar = new aqxo(debugUiChimeraActivity, (int[][][]) null);
                aqxoVar.ai().z(new cckq(debugUiChimeraActivity, aqxoVar));
            }
        });
        ((Button) findViewById(R.id.trigger_download)).setOnClickListener(new View.OnClickListener() { // from class: cckl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugUiChimeraActivity debugUiChimeraActivity = DebugUiChimeraActivity.this;
                aqxo aqxoVar = new aqxo(debugUiChimeraActivity, (int[][][]) null);
                aqxoVar.aj(true).z(new ccks(debugUiChimeraActivity, aqxoVar));
            }
        });
        ListView listView = (ListView) findViewById(R.id.file_group_list);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, new ArrayList());
        this.j = arrayAdapter;
        listView.setAdapter((ListAdapter) arrayAdapter);
        a();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "Trigger Maintenance Task").setOnMenuItemClickListener(new ccku(this));
        return super.onCreateOptionsMenu(menu);
    }
}
