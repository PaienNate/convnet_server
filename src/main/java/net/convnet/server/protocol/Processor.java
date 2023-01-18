package net.convnet.server.protocol;

import net.convnet.server.ex.ConvnetException;
import net.convnet.server.session.Session;

public interface Processor {
   Cmd accept();

   void process(Session var1, Request var2, Response var3) throws ConvnetException;
}
